package at.fhooe.mc.bachelorarbeit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.google.android.material.transition.MaterialSharedAxis;

// MOTION LAYOUT
// import androidx.constraintlayout.motion.widget.MotionLayout;

// PHYSIC BASED
// import androidx.dynamicanimation.animation.DynamicAnimation;
// import androidx.dynamicanimation.animation.SpringAnimation;

// PROPERTY ANIMATION
// import android.animation.ObjectAnimator;
// import android.animation.AnimatorSet;
// import android.animation.ValueAnimator;

// ANIMATION
// import android.view.animation.Animation;
// import android.view.animation.AnimationUtils;
// import android.content.Context;

// GIF
// import android.webkit.WebView;

// LOTTIE
// import com.airbnb.lottie.LottieAnimationView;
// import com.airbnb.lottie.LottieDrawable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.anim_button).setOnClickListener(this);
        findViewById(R.id.anim_layout_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View _v) {
        if (_v.getId() == R.id.anim_button) {
            ImageView v = findViewById(R.id.anim_view);
            v.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.idle_avd));
            AnimatedVectorDrawable d = (AnimatedVectorDrawable) v.getDrawable();
            d.start();
            // PHYSIC BASED ANIMATION
            // final View img = findViewById(R.id.anim_motion1);
            // final SpringAnimation springAnim = new SpringAnimation(img, DynamicAnimation.TRANSLATION_Y, 50);
            // final SpringAnimation springAnim2 = new SpringAnimation(img, DynamicAnimation.TRANSLATION_Y, -50);
            // springAnim.addUpdateListener((animation, value, velocity) -> springAnim.animateToFinalPosition(value));
            // springAnim.addEndListener((animation, canceled, value, velocity) -> {
            //    springAnim2.setStartValue(50);
            //    springAnim2.start();
            //});
            // springAnim.setStartValue(0);
            // springAnim.start();

            // PROPERTY ANIMATION
//            AnimatorSet set = new AnimatorSet();
//            ValueAnimator animation = ValueAnimator.ofInt(0, 360);
//            animation.addUpdateListener(_animation -> findViewById(R.id.anim_layout_button).setRotation((int) _animation.getAnimatedValue()));
//            ValueAnimator animation2 = ValueAnimator.ofInt(0, 700);
//            animation2.addUpdateListener(_animation -> findViewById(R.id.anim_layout_button).setTranslationX((int) _animation.getAnimatedValue()));
//            ValueAnimator animation3 = ValueAnimator.ofFloat(1, 1.8f, 1);
//            animation3.addUpdateListener(_animation -> {
//                findViewById(R.id.anim_layout_button).setScaleX((float) _animation.getAnimatedValue());
//                findViewById(R.id.anim_layout_button).setScaleY((float) _animation.getAnimatedValue());
//            });
//            set.play(animation).with(animation2).with(animation3);
//            set.setDuration(1000);
//            set.start();

            // AnimatorSet set = new AnimatorSet();
            // ObjectAnimator animator = ObjectAnimator.ofFloat(findViewById(R.id.anim_motion1), "translateY", 0f, 80f, 0f);
            // ObjectAnimator animator2 = ObjectAnimator.ofFloat(findViewById(R.id.anim_motion2), "translateY", 0f, 80f, 0f);
            // ObjectAnimator animator3 = ObjectAnimator.ofFloat(findViewById(R.id.anim_motion3), "translateY", 0f, 80f, 0f);
            // animator.addUpdateListener(animation -> findViewById(R.id.anim_motion1).setTranslationY((float) animation.getAnimatedValue()));
            // animator2.addUpdateListener(animation -> findViewById(R.id.anim_motion2).setTranslationY((float) animation.getAnimatedValue()));
            // animator3.addUpdateListener(animation -> findViewById(R.id.anim_motion3).setTranslationY((float) animation.getAnimatedValue()));
            // animator.setRepeatCount(ValueAnimator.INFINITE);
            // animator2.setStartDelay(150);
            // animator2.setRepeatCount(ValueAnimator.INFINITE);
            // animator3.setStartDelay(250);
            // animator3.setRepeatCount(ValueAnimator.INFINITE);
            // set.play(animator).with(animator2).with(animator3);
            // set.setDuration(1000);
            // set.start();

            //---------------------------------------------------------------------------------------------

            // ANIMATION - LAYOUT
            // Animation vertical = AnimationUtils.loadAnimation(this, R.anim.layout_animation);
            // findViewById(R.id.anim_layout_button).startAnimation(vertical);


            // ANIMATION - IDLE

            // Context c = this;
            // Animation down = AnimationUtils.loadAnimation(this, R.anim.idle_animation_first);
            // Animation up = AnimationUtils.loadAnimation(c, R.anim.idle_animation_second);
            // down.setAnimationListener(new Animation.AnimationListener() {
            // @Override
            // public void onAnimationStart(Animation animation) {
            //
            // }
            //
            // @Override
            // public void onAnimationEnd(Animation animation) {
            //         findViewById(R.id.anim_motion1).startAnimation(up);
            //         Animation up = AnimationUtils.loadAnimation(c, R.anim.idle_animation_second);
            //         up.setStartOffset(150);
            //         findViewById(R.id.anim_motion2).startAnimation(up);
            //         up = AnimationUtils.loadAnimation(c, R.anim.idle_animation_second);
            //         up.setStartOffset(250);
            //         findViewById(R.id.anim_motion3).startAnimation(up);
            // }
            //
            // @Override
            // public void onAnimationRepeat(Animation animation) {
            //
            // }
            // });
            //
            // findViewById(R.id.anim_motion1).startAnimation(down);
            //
            // down = AnimationUtils.loadAnimation(this, R.anim.idle_animation_first);
            // down.setStartOffset(150);
            // findViewById(R.id.anim_motion2).startAnimation(down);
            //
            // down = AnimationUtils.loadAnimation(this, R.anim.idle_animation_first);
            // down.setStartOffset(250);
            // findViewById(R.id.anim_motion3).startAnimation(down);

            //---------------------------------------------------------------------------------------------

            // ANIMATION DRAWABLE
            // ImageView view = findViewById(R.id.anim_view);
            // view.setBackgroundResource(R.drawable.ic_animation_list);
            // view.setBackgroundResource(R.drawable.idle_animation_list);
            // AnimationDrawable anim = (AnimationDrawable) view.getBackground();
            // anim.start();

            //---------------------------------------------------------------------------------------------

            // MOTION LAYOUT
//             MotionLayout layout = findViewById(R.id.anim_layout);
//             layout.setTransitionDuration(1000);
//             layout.transitionToEnd();
//             layout.addTransitionListener(new MotionLayout.TransitionListener() {
//             @Override
//             public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {
//
//             }
//
//             @Override
//             public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {
//
//             }
//
//             @Override
//             public void onTransitionCompleted(MotionLayout motionLayout, int i) {
//                                motionLayout.setProgress(0);
//                                motionLayout.transitionToEnd();
//             }
//
//             @Override
//             public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {
//
//             }
//             });

            //---------------------------------------------------------------------------------------------

            // GIF
            // WebView web = findViewById(R.id.anim_view);
            // web.loadUrl("file:///android_asset/ic_animation.gif");
            // web.loadUrl("file:///android_asset/idle_animation.gif");

            //---------------------------------------------------------------------------------------------

            // LOTTIE
            // LottieAnimationView anim = findViewById(R.id.anim_view);
            // anim.setRepeatCount(LottieDrawable.INFINITE);
            // anim.playAnimation();

            // VECTOR DRAWABLE


            //

        }
    }
}