package com.workout.periodization.model

data class WorkoutDay(
	val body_parts: List<BodyPart>,
	val total_volume: Double,
	val day: Int
)