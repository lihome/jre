package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ORBPortInfoListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-OS12.X-Xcode12.4-sans-NAS/jdk8u441/1521/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, December 4, 2024 8:04:25 AM GMT
*/


/** A list of ORB and port information for a particular endpoint type.
    */
public final class ORBPortInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ORBPortInfo value[] = null;

  public ORBPortInfoListHolder ()
  {
  }

  public ORBPortInfoListHolder (com.sun.corba.se.PortableActivationIDL.ORBPortInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.type ();
  }

}
