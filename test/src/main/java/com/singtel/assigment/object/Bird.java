package com.singtel.assigment.object;

import java.io.Serializable;

import com.singtel.assigment.interfaces.FlyAble;
import com.singtel.assigment.interfaces.SingAble;
import com.singtel.assigment.interfaces.WalkAble;

public class Bird extends Animal implements SingAble, FlyAble, WalkAble, Serializable {

}
