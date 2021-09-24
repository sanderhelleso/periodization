package com.workout.periodization.controller

import com.workout.periodization.model.Periodization
import com.workout.periodization.model.PeriodizationForm
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/periodization")
class PeriodizationController {

	@RequestMapping(value = ["/generate"], method = [(RequestMethod.POST)])
	fun generatePeriodization(@RequestBody periodizationForm: PeriodizationForm): Periodization {
		return Periodization(
			workout_level = periodizationForm.workout_level,
			duration_in_weeks = periodizationForm.duration_in_weeks,
			prioritized_goal = periodizationForm.prioritized_goal,
			weak_points = periodizationForm.weak_points,
			strong_points = periodizationForm.strong_points
		)
	}
}