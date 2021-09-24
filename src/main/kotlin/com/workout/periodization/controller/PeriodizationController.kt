package com.workout.periodization.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/periodization")
class PeriodizationController {

	@RequestMapping(value = ["/generate"], method = [(RequestMethod.POST)])
	fun postGeneratePeriodization(): ResponseEntity<Any> = ResponseEntity.ok("Hello World")

}