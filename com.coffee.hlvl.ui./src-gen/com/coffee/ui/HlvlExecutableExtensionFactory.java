/*
 * generated by Xtext 2.12.0
 */
package com.coffee.ui;

import com.coffee.hlvl.ui.internal.HlvlActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HlvlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return HlvlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return HlvlActivator.getInstance().getInjector(HlvlActivator.COM_COFFEE_HLVL);
	}
	
}
