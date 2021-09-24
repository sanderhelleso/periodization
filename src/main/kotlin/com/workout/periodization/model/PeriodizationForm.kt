package com.workout.periodization.model

data class PeriodizationForm(
	val workout_level: Int,
	val duration_in_weeks: Int,
	val prioritized_goal: Int,
	val weak_points: List<String>,
	val strong_points: List<String>
)