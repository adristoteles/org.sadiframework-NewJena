package ca.wilkinsonlab.sadi.test;

import com.hp.hpl.jena.rdf.model.ResourceFactory;

import org.sadiframework.SADIException;
import org.sadiframework.client.Config;
import org.sadiframework.client.Service;

public class FindServicesTest
{
	public static void main(String[] args) throws SADIException
	{
		for (Service service: Config.getConfiguration().getMasterRegistry().findServicesByAttachedProperty(ResourceFactory.createProperty("http://semanticscience.org/resource/SIO_000219")) )
		{
			System.out.println(service);
		}	
	}
}
