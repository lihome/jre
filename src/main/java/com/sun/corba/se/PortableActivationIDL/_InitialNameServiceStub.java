package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/_InitialNameServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-OS12.X-Xcode12.4-sans-NAS/jdk8u441/1521/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, December 4, 2024 8:04:25 AM GMT
*/


/** Interface used to support binding references in the bootstrap name
    * service.
    */
public class _InitialNameServiceStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.corba.se.PortableActivationIDL.InitialNameService
{


  /** bind initial name
  	*/
  public void bind (String name, org.omg.CORBA.Object obj, boolean isPersistant) throws com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind", true);
                $out.write_string (name);
                org.omg.CORBA.ObjectHelper.write ($out, obj);
                $out.write_boolean (isPersistant);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PortableActivationIDL/InitialNameService/NameAlreadyBound:1.0"))
                    throw com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                bind (name, obj, isPersistant        );
            } finally {
                _releaseReply ($in);
            }
  } // bind

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PortableActivationIDL/InitialNameService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     if (!allowCorbaNameInIOR()) {
       if (!str.startsWith("IOR:")) {
         throw new java.io.IOException(" InitialNameService only supports IOR format for Stringified Object Reference:  " + str);
       }
     }
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }

  private static boolean allowCorbaNameInIOR() 
  {
     return java.security.AccessController.doPrivileged(
       new java.security.PrivilegedAction<Boolean>() {
         public Boolean run() {
           String prop = System.getProperty("com.sun.CORBA.IDL.Stubs.allowCorbanameInIOR");
             return prop == null ? true :
               (prop.equalsIgnoreCase("false") ? false : true);
         }
       });
  }

} // class _InitialNameServiceStub
