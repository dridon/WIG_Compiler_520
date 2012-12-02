/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import java.util.*;
import wig.analysis.*;

@SuppressWarnings("nls")
public final class AFieldvalues extends PFieldvalues
{
    private final LinkedList<PFieldvalue> _fieldvalue_ = new LinkedList<PFieldvalue>();

    public AFieldvalues()
    {
        // Constructor
    }

    public AFieldvalues(
        @SuppressWarnings("hiding") List<?> _fieldvalue_)
    {
        // Constructor
        setFieldvalue(_fieldvalue_);

    }

    @Override
    public Object clone()
    {
        return new AFieldvalues(
            cloneList(this._fieldvalue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldvalues(this);
    }

    public LinkedList<PFieldvalue> getFieldvalue()
    {
        return this._fieldvalue_;
    }

    public void setFieldvalue(List<?> list)
    {
        for(PFieldvalue e : this._fieldvalue_)
        {
            e.parent(null);
        }
        this._fieldvalue_.clear();

        for(Object obj_e : list)
        {
            PFieldvalue e = (PFieldvalue) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._fieldvalue_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fieldvalue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldvalue_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PFieldvalue> i = this._fieldvalue_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFieldvalue) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
