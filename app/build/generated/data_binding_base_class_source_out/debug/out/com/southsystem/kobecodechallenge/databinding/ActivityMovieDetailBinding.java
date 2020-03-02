// Generated by data binding compiler. Do not edit!
package com.southsystem.kobecodechallenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.southsystem.kobecodechallenge.R;
import com.southsystem.kobecodechallenge.model.MovieDetail;
import com.southsystem.kobecodechallenge.view.activity.MovieDetailActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMovieDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView activityMovieDetailBackarrow;

  @NonNull
  public final View activityMovieDetailErrorComponent;

  @NonNull
  public final TextView activityMovieDetailGenre;

  @NonNull
  public final ProgressBar activityMovieDetailLoader;

  @NonNull
  public final TextView activityMovieDetailReleaseDate;

  @NonNull
  public final TextView activityMovieDetailSupportView;

  @NonNull
  public final ImageView activityMovieDetailThumbnail;

  @NonNull
  public final TextView activityMovieDetailTitle;

  @NonNull
  public final ImageView ivBackground;

  @Bindable
  protected MovieDetail mMovie;

  @Bindable
  protected MovieDetailActivity mActivity;

  protected ActivityMovieDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView activityMovieDetailBackarrow, View activityMovieDetailErrorComponent,
      TextView activityMovieDetailGenre, ProgressBar activityMovieDetailLoader,
      TextView activityMovieDetailReleaseDate, TextView activityMovieDetailSupportView,
      ImageView activityMovieDetailThumbnail, TextView activityMovieDetailTitle,
      ImageView ivBackground) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityMovieDetailBackarrow = activityMovieDetailBackarrow;
    this.activityMovieDetailErrorComponent = activityMovieDetailErrorComponent;
    this.activityMovieDetailGenre = activityMovieDetailGenre;
    this.activityMovieDetailLoader = activityMovieDetailLoader;
    this.activityMovieDetailReleaseDate = activityMovieDetailReleaseDate;
    this.activityMovieDetailSupportView = activityMovieDetailSupportView;
    this.activityMovieDetailThumbnail = activityMovieDetailThumbnail;
    this.activityMovieDetailTitle = activityMovieDetailTitle;
    this.ivBackground = ivBackground;
  }

  public abstract void setMovie(@Nullable MovieDetail movie);

  @Nullable
  public MovieDetail getMovie() {
    return mMovie;
  }

  public abstract void setActivity(@Nullable MovieDetailActivity activity);

  @Nullable
  public MovieDetailActivity getActivity() {
    return mActivity;
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieDetailBinding>inflateInternal(inflater, R.layout.activity_movie_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieDetailBinding>inflateInternal(inflater, R.layout.activity_movie_detail, null, false, component);
  }

  public static ActivityMovieDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMovieDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMovieDetailBinding)bind(component, view, R.layout.activity_movie_detail);
  }
}
