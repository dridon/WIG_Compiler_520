/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import wig.analysis.*;

@SuppressWarnings("nls")
public final class ANegintIntconst extends PIntconst
{
    private TNegIntconst _negIntconst_;

    public ANegintIntconst()
    {
        // Constructor
    }

    public ANegintIntconst(
        @SuppressWarnings("hiding") TNegIntconst _negIntconst_)
    {
        // Constructor
        setNegIntconst(_negIntconst_);

    }

    @Override
    public Object clone()
    {
        return new ANegintIntconst(
            cloneNode(this._negIntconst_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANegintIntconst(this);
    }

    public TNegIntconst getNegIntconst()
    {
        return this._negIntconst_;
    }

    public void setNegIntconst(TNegIntconst node)
    {
        if(this._negIntconst_ != null)
        {
            this._negIntconst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._negIntconst_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._negIntconst_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._negIntconst_ == child)
        {
            this._negIntconst_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._negIntconst_ == oldChild)
        {
            setNegIntconst((TNegIntconst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}