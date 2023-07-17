package cucumberDemo.hooks;

import cucmberDemo.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    BaseTest base;
	
	public Hooks(BaseTest base) {
		this.base = base;
	}
	
	@Before
	public void setupTestEnv() {
		base.setUp();
	}
	
	@After
	public void clenupTestEnv() {
		base.quitDriver();
	}

}
