package com.danibuiza.jaxb.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.danibuiza.jaxb.museum.Shapes;

public class UnMarshalJAXVBCompleteExample
{
    public static void main( String[] args )
    {

        try
        {

            File file = new File( "museums.xml" );
            JAXBContext jaxbContext = JAXBContext.newInstance( Shapes.class );

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Shapes shapes = (Shapes)jaxbUnmarshaller.unmarshal( file );
            System.out.println( shapes.getShapes() );

        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }

    }

}
