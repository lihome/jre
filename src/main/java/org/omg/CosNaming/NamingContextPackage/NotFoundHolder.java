package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, April 10, 2015 11:19:49 AM PDT
*/

public final class NotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.NotFound value = null;

  public NotFoundHolder ()
  {
  }

  public NotFoundHolder (org.omg.CosNaming.NamingContextPackage.NotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.NotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.NotFoundHelper.type ();
  }

}
