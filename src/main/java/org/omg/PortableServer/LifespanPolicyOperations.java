package org.omg.PortableServer;


/**
* org/omg/PortableServer/LifespanPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/jenkins/workspace/8-2-build-macosx-x64-Xcode12.4-sans-NAS/jdk8u401/683/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, December 19, 2023 6:12:33 PM GMT
*/


/**
	 * The LifespanPolicy specifies the lifespan of the 
	 * objects implemented in the created POA. The default 
	 * is TRANSIENT.
	 */
public interface LifespanPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.LifespanPolicyValue value ();
} // interface LifespanPolicyOperations
