package com.southsystem.kobecodechallenge.databinding;
import com.southsystem.kobecodechallenge.R;
import com.southsystem.kobecodechallenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMovieDetailBindingImpl extends ActivityMovieDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_movie_detail_error_component, 7);
        sViewsWithIds.put(R.id.activity_movie_detail_backarrow, 8);
        sViewsWithIds.put(R.id.activity_movie_detail_release_date, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityMovieDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            );
        this.activityMovieDetailGenre.setTag(null);
        this.activityMovieDetailSupportView.setTag(null);
        this.activityMovieDetailTitle.setTag(null);
        this.ivBackground.setTag(null);
        this.ivThumbnail.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
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
        if (BR.movie == variableId) {
            setMovie((com.southsystem.kobecodechallenge.model.MovieDetail) variable);
        }
        else if (BR.activity == variableId) {
            setActivity((com.southsystem.kobecodechallenge.view.activity.MovieDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.southsystem.kobecodechallenge.model.MovieDetail Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setActivity(@Nullable com.southsystem.kobecodechallenge.view.activity.MovieDetailActivity Activity) {
        this.mActivity = Activity;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String moviePoster = null;
        java.lang.String movieTitle = null;
        java.lang.String movieReleaseDate = null;
        com.southsystem.kobecodechallenge.model.MovieDetail movie = mMovie;
        java.lang.String movieOverview = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movie != null) {
                    // read movie.poster
                    moviePoster = movie.getPoster();
                    // read movie.title
                    movieTitle = movie.getTitle();
                    // read movie.releaseDate
                    movieReleaseDate = movie.getReleaseDate();
                    // read movie.overview
                    movieOverview = movie.getOverview();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityMovieDetailGenre, movieReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityMovieDetailSupportView, movieOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityMovieDetailTitle, movieTitle);
            br.com.marvel.extensions.ImageViewExtensionsKt.setImageUrl(this.ivBackground, moviePoster);
            br.com.marvel.extensions.ImageViewExtensionsKt.setImageUrl(this.ivThumbnail, moviePoster);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): activity
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}