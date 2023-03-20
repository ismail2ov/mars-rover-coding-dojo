package com.paradigmadigital.rover;

import com.paradigmadigital.Coordinate;
import com.paradigmadigital.Orientation;
import com.paradigmadigital.Plateau;

public abstract class Rover {

  private final Plateau plateau;
  private final Coordinate coordinate;
  private final Orientation orientation;

  protected Rover(Plateau plateau, Coordinate coordinate, Orientation orientation) {
    this.plateau = plateau;
    this.coordinate = coordinate;
    this.orientation = orientation;
  }

  public abstract Rover move();

  public abstract Rover rotateLeft();

  public abstract Rover rotateRight();

  public Plateau getPlateau() {
    return plateau;
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public Orientation getOrientation() {
    return orientation;
  }
}