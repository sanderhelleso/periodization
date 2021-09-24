package com.workout.periodization.model

import com.fasterxml.jackson.annotation.JsonCreator

data class Periodization(
	val workout_level: Int,
	val duration_in_weeks: Int,
	val prioritized_goal: Int,
	val weak_points: List<String>,
	val strong_points: List<String>
)

data class NewPeriodization @JsonCreator constructor(
	val workout_level: Int,
	val duration_in_weeks: Int,
	val prioritized_goal: Int,
	val weak_points: List<String>,
	val strong_points: List<String>
)