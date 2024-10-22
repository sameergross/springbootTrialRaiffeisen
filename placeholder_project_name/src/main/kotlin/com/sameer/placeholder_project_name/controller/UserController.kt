package com.sameer.placeholder_project_name.controller



import com.sameer.placeholder_project_name.entity.User
import com.sameer.placeholder_project_name.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<User>> =
        ResponseEntity.ok(userService.getAllUsers())

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<User> =
        ResponseEntity.ok(userService.getUserById(id))

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User> =
        ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user))

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long): ResponseEntity<Void> {
        userService.deleteUser(id)
        return ResponseEntity.noContent().build()
    }
}
