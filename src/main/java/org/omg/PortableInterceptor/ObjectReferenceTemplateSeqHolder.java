package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceTemplateSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64/jdk8u371/3355/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Friday, March 17, 2023 3:56:47 AM GMT
*/


/** Sequence of object reference templates is used for reporting state
   * changes that do not occur on the adapter manager.
   */
public final class ObjectReferenceTemplateSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.ObjectReferenceTemplate value[] = null;

  public ObjectReferenceTemplateSeqHolder ()
  {
  }

  public ObjectReferenceTemplateSeqHolder (org.omg.PortableInterceptor.ObjectReferenceTemplate[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHelper.type ();
  }

}
