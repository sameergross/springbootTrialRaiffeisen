package com.sameer.placeholder_project_name.service

import com.sameer.placeholder_project_name.entity.User
import com.sameer.placeholder_project_name.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: Long): User = userRepository.findById(id).orElseThrow()

    fun createUser(user: User): User = userRepository.save(user)

    fun deleteUser(id: Long) = userRepository.deleteById(id)
}
