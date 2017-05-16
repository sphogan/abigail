package com.oshkindo.abigail;

import com.hubspot.dropwizard.guicier.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class AbigailApplication extends Application<AbigailConfiguration> {

    public static void main(String[] args) throws Exception {
        new AbigailApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<AbigailConfiguration> bootstrap) {
        GuiceBundle<AbigailConfiguration> guiceBundle = GuiceBundle.defaultBuilder(AbigailConfiguration.class)
                .enableGuiceEnforcer(false)
                .modules(new AbigailModule())
                .build();

        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public void run(AbigailConfiguration abigailConfiguration, Environment environment) throws Exception {
    }
}
