package com.weber.scratchpadv2

sealed class ScreenDestinations(val name: String) {

    object HomeScreen : ScreenDestinations("HomeScreen")
    object PrepareGameSessionScreen : ScreenDestinations("PrepareGameSessionScreen")

}
