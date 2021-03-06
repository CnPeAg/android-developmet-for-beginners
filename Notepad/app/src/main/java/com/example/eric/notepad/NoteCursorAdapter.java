package com.example.eric.notepad;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.widget.CursorAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eric.notepad.data.NoteContract.NoteEntry;

/**
 * NoteCursorAdapter is an adapter for a list or grid view that uses a Cursor of note data as its
 * data source. This adapter knows how to create list items for each row of note data in the Cursor.
 */
public class NoteCursorAdapter extends CursorAdapter {
    public NoteCursorAdapter(Context context, Cursor c) { super(context, c, 0 ); }

    /**
     * Makes a new blank list item view. No data is set (or bound) to the views yet.
     *
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already
     *                moved to the correct position.
     * @param parent  The parent to which the new view is attached to
     * @return the newly created list item view.
     */
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.note_item, parent, false);
    }

    /**
     * This method binds the note data (in the current row pointed to by cursor) to the given
     * list item layout. For example, the title for the current note can be set on the heading
     * TextView in the list item layout.
     *
     * @param view    Existing view, returned earlier by newView() method
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already moved to the
     *                correct row.
     */
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find individual views that we want to modify in the list item layout
        TextView headingTextView = (TextView) view.findViewById(R.id.heading);
        TextView bodyTextView = (TextView) view.findViewById(R.id.body);

        // Find the columns of note attributes that we're interested in
        int headingColumnIndex = cursor.getColumnIndex(NoteEntry.COLUMN_TITLE);
        int bodyColumnIndex = cursor.getColumnIndex(NoteEntry.COLUMN_NOTE);

        // Read the note attributes from the Cursor for the current note
        String noteTitle = cursor.getString(headingColumnIndex);
        String noteBody = cursor.getString(bodyColumnIndex);

        // Update the TextViews with the attributes for the current note
        headingTextView.setText(noteTitle);
        bodyTextView.setText(noteBody);
    }
}
