package com.bigbrain.expenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class VideoHelperActivity extends AppCompatActivity {

    TextInputLayout t ;
    MaterialButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_helper);
        t = findViewById(R.id.et_title_view2);
        btn = findViewById(R.id.btnsubmit);
        // Initialize default options for Jitsi Meet conferences.
        URL serverURL;
        try {
            serverURL = new URL("https://meet.jit.si");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid server URL!");
        }
        JitsiMeetConferenceOptions defaultOptions
                = new JitsiMeetConferenceOptions.Builder()
                .setServerURL(serverURL)
                .setWelcomePageEnabled(false)
                .build();

        JitsiMeet.setDefaultConferenceOptions(defaultOptions);


        btn.setOnClickListener(v -> {
            String text = t.getEditText().toString();
            if(!text.isEmpty()) {
                if (text.length() > 0) {
                    // Build options object for joining the conference. The SDK will merge the default
                    // one we set earlier and this one when joining.
                    JitsiMeetConferenceOptions options
                            = new JitsiMeetConferenceOptions.Builder()
                            .setRoom(text)
                            .build();
                    // Launch the new activity with the given options. The launch() method takes care
                    // of creating the required Intent and passing the options.
                    JitsiMeetActivity.launch(this, options);
                }
            } else {
                Toast.makeText(this, "PLease fill your concern", Toast.LENGTH_SHORT).show();
            }
        });


    }

}