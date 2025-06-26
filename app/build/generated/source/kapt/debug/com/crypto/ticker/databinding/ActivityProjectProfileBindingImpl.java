package com.crypto.ticker.databinding;
import com.crypto.ticker.R;
import com.crypto.ticker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityProjectProfileBindingImpl extends ActivityProjectProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lineChart, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.coinItemImageView, 5);
        sViewsWithIds.put(R.id.coinItemNameTextView, 6);
        sViewsWithIds.put(R.id.coinItemSymbolTextView, 7);
        sViewsWithIds.put(R.id.coinItemPriceTextView, 8);
        sViewsWithIds.put(R.id.coinItemChangeTextView, 9);
        sViewsWithIds.put(R.id.barrier, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProjectProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityProjectProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.Barrier) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ProgressBar) bindings[2]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.coinListLoading.setTag(null);
        this.lineChartTitle.setTag(null);
        this.projectProfileMainLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDataError((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDataError(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelDataError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelDataError = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        boolean ViewModelDataError1 = false;
        int viewModelIsLoadingViewModelDataErrorBooleanFalseViewGONEViewVISIBLE = 0;
        boolean viewModelIsLoadingViewModelDataErrorBooleanFalse = false;
        java.lang.Boolean viewModelDataErrorGetValue = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDataErrorGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.isLoading
                    viewModelIsLoading = viewModel.isLoading();
                }
                updateLiveDataRegistration(1, viewModelIsLoading);


                if (viewModelIsLoading != null) {
                    // read viewModel.isLoading.getValue()
                    viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
            if((dirtyFlags & 0xfL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }

            if ((dirtyFlags & 0xeL) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModel != null) {
                    // read viewModel.dataError
                    viewModelDataError = viewModel.getDataError();
                }
                updateLiveDataRegistration(0, viewModelDataError);


                if (viewModelDataError != null) {
                    // read viewModel.dataError.getValue()
                    viewModelDataErrorGetValue = viewModelDataError.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelDataErrorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDataErrorGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue())
                ViewModelDataError1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelDataErrorGetValue;
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue()) : false
                viewModelIsLoadingViewModelDataErrorBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (ViewModelDataError1) : (false));
            if((dirtyFlags & 0xfL) != 0) {
                if(viewModelIsLoadingViewModelDataErrorBooleanFalse) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue()) : false ? View.GONE : View.VISIBLE
                viewModelIsLoadingViewModelDataErrorBooleanFalseViewGONEViewVISIBLE = ((viewModelIsLoadingViewModelDataErrorBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.coinListLoading.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.lineChart.setVisibility(viewModelIsLoadingViewModelDataErrorBooleanFalseViewGONEViewVISIBLE);
            this.lineChartTitle.setVisibility(viewModelIsLoadingViewModelDataErrorBooleanFalseViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.dataError
        flag 1 (0x2L): viewModel.isLoading
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue()) : false ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue()) : false ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue()) : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataError.getValue()) : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}