package com.crypto.ticker.databinding;
import com.crypto.ticker.R;
import com.crypto.ticker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentFavoritesBindingImpl extends FragmentFavoritesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.favouritesRecyclerView, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavoritesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentFavoritesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.favouritesMainLayout.setTag(null);
        this.noFavouritesView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.crypto.ticker.ui.home.favoruites.FavoritesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crypto.ticker.ui.home.favoruites.FavoritesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFavouritesEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFavouritesEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelFavouritesEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelFavouritesEmptyViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelFavouritesEmptyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFavouritesEmptyGetValue = false;
        com.crypto.ticker.ui.home.favoruites.FavoritesViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelFavouritesEmpty = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.favouritesEmpty
                    viewModelFavouritesEmpty = viewModel.getFavouritesEmpty();
                }
                updateLiveDataRegistration(0, viewModelFavouritesEmpty);


                if (viewModelFavouritesEmpty != null) {
                    // read viewModel.favouritesEmpty.getValue()
                    viewModelFavouritesEmptyGetValue = viewModelFavouritesEmpty.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.favouritesEmpty.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelFavouritesEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFavouritesEmptyGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelFavouritesEmptyGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.favouritesEmpty.getValue()) ? View.VISIBLE : View.GONE
                viewModelFavouritesEmptyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelFavouritesEmptyGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.noFavouritesView.setVisibility(viewModelFavouritesEmptyViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.favouritesEmpty
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.favouritesEmpty.getValue()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.favouritesEmpty.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}