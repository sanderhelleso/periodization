package com.workout.periodization.model

data class BodyPart(
	val name: String,
	val volume: Double,
	val exercises: List<Exercise>
)