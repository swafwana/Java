package MODULE1;

import MODULE1.CPU.Processor;

public class CPUDetails {
		public static void main(String[] args) {
			CPU cpu=new CPU();
			CPU.Processor processor=cpu.new Processor();
			CPU.RAM ram=new CPU.RAM();
			System.out.println("Processor Cache= "+processor.getCache());
			System.out.println("Processor Cache= "+ram.getClockSpeed());}
			

}
