package com.msuser.msuser.controller;


import com.msuser.msuser.dto.UserRegistrationDTO;
import com.msuser.msuser.service.IUserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@PreAuthorize("hasRole('ROLE_user_client_role')")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search/{username}")
    public ResponseEntity<?> findUserByUserName(@PathVariable @Valid String username) {
        return new ResponseEntity<>(userService.searchUserByUsername(username), HttpStatus.ACCEPTED);
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<?> findUserByUserName(@PathVariable @NotNull String userId, @RequestBody @Valid UserRegistrationDTO userRegistrationDTO)  {
        userService.updateUser(userId,userRegistrationDTO);
        return ResponseEntity.ok("User successfully updated");
    }

}
