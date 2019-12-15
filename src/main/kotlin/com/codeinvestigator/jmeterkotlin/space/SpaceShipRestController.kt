package com.codeinvestigator.jmeterkotlin.space

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class SpaceShipRestController {

    @GetMapping("/destination")
    fun navigationDestination() : String{
        return "Saturn"
    }

    @GetMapping("/destination/secondary")
    fun navigationDestinationSecondary() : String{
        return "Jupiter"
    }

    @GetMapping("/spaceship")
    fun spaceship() : SpaceShip{
        return SpaceShip(10, "The fast and cool Hawk")
    }



}