package com.workout.periodization.model

data class Exercise(
	val name: String,
	val body_part: String,
	val compound: Boolean,
	val sets: Int,
	val min_reps: Int,
	val max_reps: Int,
	val volume_multiplier: Double
)