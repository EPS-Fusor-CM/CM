package com.dmulye.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.dmulye.shape.Shapes;

public class UnMarshalJAXB
{
    public static void main( String[] args )
    {

        try
        {

            File file = new File( "shapes.xml" );
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
