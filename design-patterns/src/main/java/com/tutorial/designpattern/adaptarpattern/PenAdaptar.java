package com.tutorial.designpattern.adaptarpattern;

import java.util.Collection;
import java.util.HashSet;

public class PenAdaptar implements Pen {

	private ReynoldsPen reynoldsPen;

	public void setReynoldsPen(ReynoldsPen reynoldsPen) {
		this.reynoldsPen = reynoldsPen;
	}

	@Override
	public void write(String str) {

		reynoldsPen.scribble(str);
		Collection collection=new HashSet<>();

	}

}
