package in.ineuron.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="fFlight")
public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight.class file is loading...");
	}

	public FirstFlight() {
		System.out.println("FirstFlight :: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()");
		return "FirstFlight Courier will delived with the order id ::" + oid + " for the ordered products";
	}

}
