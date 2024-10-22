package com.sameer.placeholder_project_name.repository

import com.sameer.placeholder_project_name.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>
