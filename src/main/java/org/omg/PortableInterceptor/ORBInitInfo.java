package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ORBInitInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/jenkins/workspace/8-2-build-macosx-x64-Xcode12.4-sans-NAS/jdk8u401/683/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, December 19, 2023 6:12:33 PM GMT
*/


/** 
   * Passed to each <code>ORBInitializer</code>, allowing it to
   * to register interceptors and perform other duties while the ORB is 
   * initializing.
   * <p>
   * The <code>ORBInitInfo</code> object is only valid during 
   * <code>ORB.init</code>.  If a service keeps a reference to its 
   * <code>ORBInitInfo</code> object and tries to use it after 
   * <code>ORB.init</code> returns, the object no longer exists and an 
   * <code>OBJECT_NOT_EXIST</code> exception shall be thrown.
   *
   * @see ORBInitializer
   */
public interface ORBInitInfo extends ORBInitInfoOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface ORBInitInfo
