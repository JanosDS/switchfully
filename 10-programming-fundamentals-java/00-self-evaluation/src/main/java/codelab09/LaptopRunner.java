package codelab09;

import codelab09.peripherals.KeyBoard;
import codelab09.peripherals.KeySwitches;
import codelab09.peripherals.Mouse;
import codelab09.computerParts.processor.Processor;
import codelab09.computerParts.processor.ProcessorMode;
import codelab09.computerParts.screen.Screen;
import codelab09.computerParts.screen.ScreenType;
import codelab09.computerParts.storage.Storage;
import codelab09.computerParts.storage.StorageType;

import java.awt.*;

public class LaptopRunner {
	public static void main(String[] args) {
		Processor intelI7 = new Processor("Intel I7 9959595", ProcessorMode.NORMAL);
		Screen screen = new Screen("Dell superScreen", ScreenType.LED, "1900x1080", 500, Color.BLACK);
		Storage kingstonSSD = new Storage("Kingston SuperSpeedDrive", StorageType.SSD, 5000, 500);
		Laptop myLaptop = new Laptop(intelI7, screen, kingstonSSD);

		System.out.println(myLaptop.toString());

		Mouse mouse = new Mouse(2400, true, 600);
		mouse.plugIn(myLaptop);

		KeyBoard keyboard = new KeyBoard(KeySwitches.CLICKY, true);
		keyboard.plugIn(myLaptop);

		System.out.println(myLaptop.toString());

		System.out.println(myLaptop.usePeripheral(mouse));
		System.out.println(myLaptop.usePeripheral(keyboard));
	}
}
