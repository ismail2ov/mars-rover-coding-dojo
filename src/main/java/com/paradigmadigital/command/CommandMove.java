package com.paradigmadigital.command;

import com.paradigmadigital.rover.Rover;

public class CommandMove implements Command {

  @Override
  public Rover execute(Rover rover) {
    return rover.move();
  }
}