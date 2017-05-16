package com.oshkindo.abigail;

import com.google.inject.Binder;
import com.hubspot.dropwizard.guicier.DropwizardAwareModule;
import com.oshkindo.abigail.resources.PostsResource;
import rocks.davenport.views.DavenportMessageBodyWriter;

public class AbigailModule extends DropwizardAwareModule<AbigailConfiguration> {
    @Override
    public void configure(Binder binder) {
        binder.bind(DavenportMessageBodyWriter.class);
        binder.bind(PostsResource.class);
    }
}
