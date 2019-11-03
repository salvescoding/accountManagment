package com.salves.photoapp.api.account.account.web.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController {

    @GetMapping("/status")
    fun status() = "Is working correctly the account microservice"
}
