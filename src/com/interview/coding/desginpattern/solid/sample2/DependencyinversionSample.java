package com.interview.coding.desginpattern.solid.sample2;

public class DependencyinversionSample {

}


class MacBook{
	private final KeyBoard keyBoard;
	private final Mouse mouse;
	
	public MacBook(KeyBoard keyBoard,Mouse mouse) {
		this.keyBoard=new WiredKeyBoard();
		this.mouse=new WiredMouse();
	}
}


interface KeyBoard{
}

interface Mouse{
}

class WiredKeyBoard implements KeyBoard{
	
}

class BluetoothKeyBoard implements KeyBoard{
	
}

class WiredMouse implements Mouse{
	
}

class BluetoothMouse implements Mouse{
	
}