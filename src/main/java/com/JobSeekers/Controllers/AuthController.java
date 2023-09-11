package com.JobSeekers.Controllers;

import com.JobSeekers.Models.AuthModel;
import com.JobSeekers.Repositorys.AuthRepo;
import com.JobSeekers.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth/")
@CrossOrigin(origins = "http://localhost:4200/")
public class AuthController {

    @Autowired
    AuthService authService;
    @Autowired
    AuthRepo authRepo;
    @PostMapping("/register")
    public String register(@RequestBody AuthModel reg) throws Exception{

        String emailId= reg.getEmailId();
//        String getUserEmail=this.authRepo.findByEmailId(emailId);
//        if ( getUserEmail.isEmpty() && emailId !=null) {
//            this.authService.register(reg);
//            return "Register Successfully";
//        }
//      else
//          throw new Exception("User with "+emailId+" is already availabel");

        this.authService.register(reg);
     return "Register Successfully";
    }

    @PostMapping("login")
    public ResponseEntity<AuthModel>  loginUser(@RequestBody AuthModel regi) throws Exception {
        String tempEmail=regi.getEmailId();
        String tempPassword=regi.getPassword();

        AuthModel valLogin = null;
        if (tempEmail !=null && tempPassword !=null	) {
            valLogin=this.authRepo.findByEmailIdAndPassword(tempEmail, tempPassword);
            System.out.println( valLogin + "get email and password");

        }
        if(valLogin==null) {

            throw new Exception(" Email and Password is wrong ");

        }
        return ResponseEntity.ok(valLogin);
    }
}
