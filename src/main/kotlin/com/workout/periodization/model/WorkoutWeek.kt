package com.workout.periodization.model

data class WorkoutWeek(
	val week_of_plan: Int,
	val num_workouts: Int,
	val workout_days: List<WorkoutDay>
)