/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import wig.analysis.*;

@SuppressWarnings("nls")
public final class ASession extends PSession
{
    private TIdentifier _identifier_;
    private PCompoundstm _compoundstm_;

    public ASession()
    {
        // Constructor
    }

    public ASession(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PCompoundstm _compoundstm_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setCompoundstm(_compoundstm_);

    }

    @Override
    public Object clone()
    {
        return new ASession(
            cloneNode(this._identifier_),
            cloneNode(this._compoundstm_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASession(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public PCompoundstm getCompoundstm()
    {
        return this._compoundstm_;
    }

    public void setCompoundstm(PCompoundstm node)
    {
        if(this._compoundstm_ != null)
        {
            this._compoundstm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._compoundstm_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._compoundstm_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._compoundstm_ == child)
        {
            this._compoundstm_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._compoundstm_ == oldChild)
        {
            setCompoundstm((PCompoundstm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}