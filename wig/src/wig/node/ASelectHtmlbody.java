/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.node;

import java.util.*;
import wig.analysis.*;

@SuppressWarnings("nls")
public final class ASelectHtmlbody extends PHtmlbody
{
    private TSelect _selectTag_;
    private final LinkedList<PInputattr> _inputattr_ = new LinkedList<PInputattr>();
    private TGt _firstGt_;
    private final LinkedList<PHtmlbody> _htmlbody_ = new LinkedList<PHtmlbody>();

    public ASelectHtmlbody()
    {
        // Constructor
    }

    public ASelectHtmlbody(
        @SuppressWarnings("hiding") TSelect _selectTag_,
        @SuppressWarnings("hiding") List<?> _inputattr_,
        @SuppressWarnings("hiding") TGt _firstGt_,
        @SuppressWarnings("hiding") List<?> _htmlbody_)
    {
        // Constructor
        setSelectTag(_selectTag_);

        setInputattr(_inputattr_);

        setFirstGt(_firstGt_);

        setHtmlbody(_htmlbody_);

    }

    @Override
    public Object clone()
    {
        return new ASelectHtmlbody(
            cloneNode(this._selectTag_),
            cloneList(this._inputattr_),
            cloneNode(this._firstGt_),
            cloneList(this._htmlbody_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASelectHtmlbody(this);
    }

    public TSelect getSelectTag()
    {
        return this._selectTag_;
    }

    public void setSelectTag(TSelect node)
    {
        if(this._selectTag_ != null)
        {
            this._selectTag_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._selectTag_ = node;
    }

    public LinkedList<PInputattr> getInputattr()
    {
        return this._inputattr_;
    }

    public void setInputattr(List<?> list)
    {
        for(PInputattr e : this._inputattr_)
        {
            e.parent(null);
        }
        this._inputattr_.clear();

        for(Object obj_e : list)
        {
            PInputattr e = (PInputattr) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._inputattr_.add(e);
        }
    }

    public TGt getFirstGt()
    {
        return this._firstGt_;
    }

    public void setFirstGt(TGt node)
    {
        if(this._firstGt_ != null)
        {
            this._firstGt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._firstGt_ = node;
    }

    public LinkedList<PHtmlbody> getHtmlbody()
    {
        return this._htmlbody_;
    }

    public void setHtmlbody(List<?> list)
    {
        for(PHtmlbody e : this._htmlbody_)
        {
            e.parent(null);
        }
        this._htmlbody_.clear();

        for(Object obj_e : list)
        {
            PHtmlbody e = (PHtmlbody) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._htmlbody_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._selectTag_)
            + toString(this._inputattr_)
            + toString(this._firstGt_)
            + toString(this._htmlbody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._selectTag_ == child)
        {
            this._selectTag_ = null;
            return;
        }

        if(this._inputattr_.remove(child))
        {
            return;
        }

        if(this._firstGt_ == child)
        {
            this._firstGt_ = null;
            return;
        }

        if(this._htmlbody_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._selectTag_ == oldChild)
        {
            setSelectTag((TSelect) newChild);
            return;
        }

        for(ListIterator<PInputattr> i = this._inputattr_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PInputattr) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._firstGt_ == oldChild)
        {
            setFirstGt((TGt) newChild);
            return;
        }

        for(ListIterator<PHtmlbody> i = this._htmlbody_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PHtmlbody) newChild);
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
