package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServicePassword;
import com.example.demo.utils.JwtUtils;


@RestController
public class AuthController {

	
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	AuthenticationManager authenticates;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	JwtUtils jwtutil;
	
	@Autowired
	private UserServicePassword userServicePassword;
	
	PasswordEncoder passwordEncoder;

	

	
	@PostMapping("/subs")
	@CrossOrigin("http://localhost:3000")
	private ResponseEntity<AuthenticationResponse>subscribeClient(@RequestBody AuthenticationRequest authreq){
		UserModel usermodel =new UserModel();
		
		
		

		this.passwordEncoder = new BCryptPasswordEncoder();
		usermodel.setUsername(authreq.getUsername());
		String password = authreq.getPassword();
		usermodel.setRole(authreq.getRole());
				
		usermodel.setPassword(this.passwordEncoder.encode(password));
		
//		
		
		
		try {
			userrepo.save(usermodel);
		}
		catch(Exception e){
			return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse
					("Error during subscription ") , HttpStatus.OK);
		}
		
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse
				("Successful subs for client " +authreq.getUsername()), HttpStatus.OK);
//		return ResponseEntity.ok(new AuthenticationResponse());
	}
	
	
	@PostMapping("/auth")
	@CrossOrigin("http://localhost:3000")
	private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authreq){
		String username=authreq.getUsername();
		String password= authreq.getPassword();




		try {
			authenticates.authenticate(new UsernamePasswordAuthenticationToken(authreq.getUsername(), authreq.getPassword()));
				
		}
		catch(Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse(false));
		}
		
		UserDetails userdetails= userservice.loadUserByUsername(username);
		
		String jwt = jwtutil.generateToken(userdetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

	@GetMapping("/{username}")
	@CrossOrigin("http://localhost:3000")
	private String testingtoken(@PathVariable String username ) {
	UserModel userModel =userrepo.findByusername(username);
	String role = userModel.getRole();
		return  role;
	}

	@GetMapping("/dashboard")
	private String dashboard() {
		return "Welcome to dashboard...!";
	}


	
}
