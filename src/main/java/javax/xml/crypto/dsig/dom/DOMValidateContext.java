/*
 * Copyright (c) 2005, 2023, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
/*
 * $Id: DOMValidateContext.java,v 1.8 2005/05/10 16:31:14 mullan Exp $
 */
package javax.xml.crypto.dsig.dom;

import javax.xml.crypto.KeySelector;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.XMLValidateContext;
import java.security.Key;
import org.w3c.dom.Node;

/**
 * A DOM-specific {@link XMLValidateContext}. This class contains additional
 * methods to specify the location in a DOM tree where an {@link XMLSignature}
 * is to be unmarshalled and validated from.
 *
 * <p>Note that the behavior of an unmarshalled <code>XMLSignature</code>
 * is undefined if the contents of the underlying DOM tree are modified by the
 * caller after the <code>XMLSignature</code> is created.
 *
 * <p>Also, note that <code>DOMValidateContext</code> instances can contain
 * information and state specific to the XML signature structure it is
 * used with. The results are unpredictable if a
 * <code>DOMValidateContext</code> is used with different signature structures
 * (for example, you should not use the same <code>DOMValidateContext</code>
 * instance to validate two different {@link XMLSignature} objects).
 *
 * @implNote
 * The JDK implementation supports a secure validation mode which can be
 * enabled by setting the <code>org.jcp.xml.dsig.secureValidation</code> property
 * to <code>Boolean.TRUE</code> (see the {@link #setProperty setProperty} method).
 * When enabled, validation of XML signatures are subject to stricter checking
 * of algorithms and other constraints as specified by the
 * <code>jdk.xml.dsig.secureValidationPolicy</code> security property.
 * The mode can be disabled by setting the property to {@code Boolean.FALSE}.
 * The mode can also be enabled or disabled by setting the
 * org.jcp.xml.dsig.secureValidation system property to "true" or "false".
 * Any other value for the system property is also treated as "false".
 * If the system property is set, it supersedes the
 * {@code DOMValidateContext} property value. The secure validation mode is
 * enabled by default if you are running code with a SecurityManager, otherwise
 * it is disabled by default.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#unmarshalXMLSignature(XMLValidateContext)
 */
public class DOMValidateContext extends DOMCryptoContext
    implements XMLValidateContext {

    private Node node;

    /**
     * Creates a <code>DOMValidateContext</code> containing the specified key
     * selector and node.
     *
     * @param ks a key selector for finding a validation key
     * @param node the node
     * @throws NullPointerException if <code>ks</code> or <code>node</code> is
     *    <code>null</code>
     */
    public DOMValidateContext(KeySelector ks, Node node) {
        if (ks == null) {
            throw new NullPointerException("key selector is null");
        }
        init(node, ks);
    }

    /**
     * Creates a <code>DOMValidateContext</code> containing the specified key
     * and node. The validating key will be stored in a
     * {@link KeySelector#singletonKeySelector singleton KeySelector} that
     * is returned when the {@link #getKeySelector getKeySelector}
     * method is called.
     *
     * @param validatingKey the validating key
     * @param node the node
     * @throws NullPointerException if <code>validatingKey</code> or
     *    <code>node</code> is <code>null</code>
     */
    public DOMValidateContext(Key validatingKey, Node node) {
        if (validatingKey == null) {
            throw new NullPointerException("validatingKey is null");
        }
        init(node, KeySelector.singletonKeySelector(validatingKey));
    }

    private void init(Node node, KeySelector ks) {
        if (node == null) {
            throw new NullPointerException("node is null");
        }

        this.node = node;
        super.setKeySelector(ks);
        super.setProperty("org.jcp.xml.dsig.secureValidation", Boolean.TRUE);
    }

    /**
     * Sets the node.
     *
     * @param node the node
     * @throws NullPointerException if <code>node</code> is <code>null</code>
     * @see #getNode
     */
    public void setNode(Node node) {
        if (node == null) {
            throw new NullPointerException();
        }
        this.node = node;
    }

    /**
     * Returns the node.
     *
     * @return the node (never <code>null</code>)
     * @see #setNode(Node)
     */
    public Node getNode() {
        return node;
    }
}
