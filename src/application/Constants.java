package application;

public class Constants {

    public static final String add_tag = "ADD";
    public static final String delete_tag = "DELETE";
    public static final String replace_tag = "REPLACE";
    public static final String alter_tag = "ALTER";
    public static final String mark_tag = "MARK";
    public static final String unmark_tag = "UNMARK";
    public static final String recur_tag = "ADD_RECUR";
    public static final String tag_weekly = "weekly";
    public static final String tag_monthly = "monthly";
    public static final String tag_daily = "daily";
    public static final String tag_yearly = "yearly";
    public static final String TYPE_RECUR = "recur";
    public static final String TYPE_EVENT = "event";
    public static final String TYPE_DEADLINE = "deadline";
    public static final String TYPE_FLOATING = "task";
    public static final String STATUS_COMPLETE = "complete";
    public static final String STATUS_INCOMPLETE = "incomplete";

    public static final String APP_NAME = "TBA";

    // Limit for number of days before current day for which task without year
    // will be entered as overdue task
    public static final int BEGINNING_OF_INDEX = 0;
    public static final int DAYS_OFFSET = 7;
    public static final int NEXT_DAY_OFFSET = 1;
    public static final int BEGINNING_OF_LIST = 1;
    public static final int NUMBER_ONE = 1;

    public static final int EDIT_INDEX_FIELD = 2;
    public static final int EDIT_INDEX_TITLE = 3;

    public static final int INDEX_OUT_OF_LIST = -1;

    public static final String LABEL_EDIT_TASK = "Edit Task";
    public static final String LABEL_ADD_TASK = "Add New Task";
    public static final String LABEL_HELP = "Help";

    public static final String LABEL_NEW_TITLE = "Title:";
    public static final String LABEL_TITLE = "New Title:";
    public static final String LABEL_NEW_START_TIME = "New Start Time:";
    public static final String LABEL_CURRENT_START_TIME = "Current Start Time:";
    public static final String LABEL_NEW_END_TIME = "New End Time:";
    public static final String LABEL_CURRENT_END_TIME = "Current End Time:";
    public static final String LABEL_START_DATE = "Start Date: ";

    public static final String LABEL_START = "Start:";
    public static final String LABEL_END = "End:";
    public static final String LABEL_RECURRING = "Repeat:";

    // Separators
    public static final String SEPARATOR = "\\\\";
    public static final String SEPARATOR_SLASH = "/";
    public static final String SEPARATOR_DOT = "\\.";
    public static final String SEPARATOR_TO = " to ";
    public static final String SEPARATOR_DASH = "-";
    public static final String SEPERATOR_MULTI_SPACE = "\\s+";

    // double quote
    public static final String DOUBLE_QUOTE = "\"";

    public static final String NOT_APPLICABLE = "N/A";

    // dot
    public static final String DOT = ".";

    // Dictionaries
    public static final String[] DICTIONARY_ADD = { "add", "plus", "create", "make" };
    public static final String[] DICTIONARY_DELETE = { "delete", "rm", "del", "remove", "minus" };
    public static final String[] DICTIONARY_SHOW = { "show", "display", "sh" };
    public static final String[] DICTIONARY_SEARCH = { "search", "find", "sr" };
    public static final String[] DICTIONARY_EDIT = { "edit", "change", "modify" };
    public static final String[] DICTIONARY_MARK = { "mark", "m", "complete", "comp" };
    public static final String[] DICTIONARY_UNMARK = { "unmark", "um", "incomplete", "incomp" };
    public static final String[] DICTIONARY_UNDO = { "undo", "un" };
    public static final String[] DICTIONARY_REDO = { "redo", "re" };
    public static final String[] DICTIONARY_VIEW_HOMESCREEN = { "home", "h" };
    public static final String[] DICTIONARY_SETPATH = { "setpath", "set" };
    public static final String[] DICTIONARY_HELP = { "help" };
    public static final String[] DICTIONARY_EXIT = { "exit", "ex", "quit" };
    public static final String[] DICTIONARY_ENQUIREPATH = { "enquirepath", "en", "viewpath" };
    public static final String[] DICTIONARY_PARAMETERS = { "location", "loc", "date", "startdate", "enddate", "sd",
	    "ed", "time", "starttime", "endtime", "st", "et", "from", "to" };

    // Months
    public static final String[] MONTHS_SHORT = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct",
	    "nov", "dec" };
    public static final String[] MONTHS_LONG = { "january", "february", "march", "april", "may", "june", "july",
	    "august", "september", "october", "november", "december" };
    public static final String[] MONTHS_1ST_LETTER_CAPS_SHORT = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
	    "Aug", "Sep", "Oct", "Nov", "Dec" };
    public static final String[] MONTHS_1ST_LETTER_CAPS_LONG = { "January", "February", "March", "April", "May", "June",
	    "July", "August", "September", "October", "November", "December" };

    // Day Keywords
    public static final String[] DICTIONARY_TOMORROW = { "tomorrow", "tmr" };
    public static final String[] DICTIONARY_TODAY = { "today", "tdy" };

    // Commands
    public static final String COMMAND_ADD = "add";
    public static final String COMMAND_DELETE = "delete";
    public static final String COMMAND_SHOW = "show";
    public static final String COMMAND_SEARCH = "search";
    public static final String COMMAND_EDIT = "edit";
    public static final String COMMAND_UNDO = "undo";
    public static final String COMMAND_REDO = "redo";
    public static final String COMMAND_MARK = "mark";
    public static final String COMMAND_UNMARK = "unmark";
    public static final String COMMAND_VIEW_HOMESCREEN = "home";
    public static final String COMMAND_HELP = "help";
    public static final String COMMAND_EXIT = "exit";
    public static final String COMMAND_INVALID = "invalid command";
    public static final String COMMAND_ALERT = "alert";
    public static final String COMMAND_CLEAR = "clear";
    public static final String COMMAND_SETPATH = "setpath";
    public static final String COMMAND_ENQUIREPATH = "enquirepath";

    // year
    public static final int YEAR_2000 = 2000;
    public static final int YEAR_0 = 0;

    // number of milliseconds in a day
    public static final int MILLISECONDS_IN_A_DAY = 1000 * 60 * 60 * 24;

    // Feedback Strings
    public static final String QUOTE = "\"";
    // public static final String LINEBREAK =
    // System.getProperty("line.separator");
    public static final String LINEBREAK = "\n";
    public static final String FEEDBACK_ADD_SUCCESS = " added successfully!";
    public static final String FEEDBACK_DEL_SUCCESS = " deleted successfully!";
    public static final String FEEDBACK_MASS_DEL_SUCCESS = "Mass delete performed successfully!";
    public static final String FEEDBACK_MASS_DEL_FAILURE = "Invalid task ID specified!";
    public static final String FEEDBACK_EDIT_SUCCESS = " was edited succesfully!";
    public static final String FEEDBACK_SHOW_SUCCESS = "Displaying search results for: ";
    public static final String FEEDBACK_SHOW_HITS_SINGLE = " task found!";
    public static final String FEEDBACK_SHOW_HITS_MULTI = " tasks found!";
    public static final String FEEDBACK_SHOW_FAILURE = "There are no tasks due on that day!";
    public static final String FEEDBACK_SHOW_OVERDUE_SUCCESS = "<html>Displaying overdue tasks!";
    public static final String FEEDBACK_SHOW_OVERDUE_FAILURE = "No overdue tasks were found!";
    public static final String FEEDBACK_SHOW_ARCHIVE_SUCCESS = "Displaying tasks in archive!";
    public static final String FEEDBACK_SHOW_ARCHIVE_FAILURE = "There are no tasks in your archive!";
    public static final String FEEDBACK_SHOW_WEEK_SUCCESS = "Displaying agenda for next 7 days!";
    public static final String FEEDBACK_SHOW_WEEK_FAILURE = "No tasks due in the next 7 days!";
    public static final String FEEDBACK_SHOW_MONTH_SUCCESS = "Displaying agenda for ";
    public static final String FEEDBACK_SHOW_DATE_SUCCESS = "Displaying all tasks that is due by ";
    public static final String FEEDBACK_SHOW_MONTH_FAILURE = "No tasks due in ";
    public static final String FEEDBACK_SHOW_ALL_SUCCESS = "Displaying all tasks found in database!";
    public static final String FEEDBACK_SHOW_ALL_FAILURE = "No tasks found in database!";
    public static final String FEEDBACK_SHOW_COMPLETED_SUCCESS = "Showing all completed tasks";
    public static final String FEEDBACK_SHOW_INCOMPLETE_SUCCESS = "Showing all unfinished tasks";
    public static final String FEEDBACK_SEARCH_SUCCESS_SINGLE = "Search results for tasks with the keyword: ";
    public static final String FEEDBACK_SEARCH_SUCCESS_MULTI = "Search results for tasks with the keywords: ";
    public static final String FEEDBACK_SEARCH_FAILURE = "SEARCH FAILED";
    public static final String FEEDBACK_SEARCH_FAILURE_SINGLE = "No tasks were found with the keyword: ";
    public static final String FEEDBACK_SEARCH_FAILURE_MULTI = "No tasks were found with the keywords: ";
    public static final String FEEDBACK_DONE_SUCCESS = " has been completed!";
    public static final String FEEDBACK_DONE_FAILURE = "That task has already been completed!";
    public static final String FEEDBACK_MASS_DONE_SUCCESS = "Specified tasks have been marked as done!";
    public static final String FEEDBACK_MASS_DONE_FAILURE = "Invalid task ID specified!";
    public static final String FEEDBACK_NOT_DONE_SUCCESS = " is now pending completion!";
    public static final String FEEDBACK_NOT_DONE_FAILURE = "That task is already pending completion!";
    public static final String FEEDBACK_MASS_NOT_DONE_SUCCESS = "Specified tasks have been marked as pending!";
    public static final String FEEDBACK_MASS_NOT_DONE_FAILURE = "Invalid task ID specified!";
    public static final String FEEDBACK_UNDO_SUCCESS = "Last action has been undone!";
    public static final String FEEDBACK_UNDO_FAILURE = "Nothing to undo!";
    public static final String FEEDBACK_REDO_SUCCESS = "Redone!";
    public static final String FEEDBACK_REDO_FAILURE = "Nothing to redo!";
    public static final String FEEDBACK_VIEW_HOMESCREEN = "Displaying Home-Screen!";
    public static final String FEEDBACK_VIEW_TODAY = "Displaying all tasks from today until ";
    public static final String FEEDBACK_VIEW_HELP = "Displaying help screen";
    public static final String FEEDBACK_INVALID = "That is an invalid action!";
    public static final String FEEDBACK_INVALID_NUMBER_OF_QUOTES = "Invaild number of quotes";
    public static final String FEEDBACK_INVALID_PARAMETERS_FOR_EDIT = "Invalid parameters for edit command";
    public static final String FEEDBACK_SETPATH_SUCCESS = "New save location is: ";
    public static final String FEEDBACK_SETPATH_FAILURE = " not found! Save location is not changed";
    public static final String FEEDBACK_SETPATH_LONGFILE = "File path is too long! Save location is not changed";

    // date formats
    public static String[] dateFormats = { "dd MMM yy", "d/M/yy", "d/M", "d-M-yy", "d MMM", "dd MMMM", "dd.MM.yy",
	    "d-M", "dd.M" };

    // time formats
    public static String[] timeFormats = { "HHmm", "H mm", "HH:mm", "HH", "HH.mm", "H.mm", "H:mm", "H" };

    // date-time formats
    public static String[] dateTimeFormats = { "d MMM yyyy HHmm", "d/M/yy", "d/M", "d-M-y", "d MMM", "d MMMM",
	    "dd.MM.yyyy", "d-M", "dd.M" };

    public static String[] dateRegex = {
	    "((31(?!\\s(feb(ruary)?|apr(il)?|june?|(sep(?=\\b|t)t?|nov)(ember)?)))|(0?[1-9])|1\\d|2[0-8]|29|30)\\s(jan(uary)?|feb(ruary)?|ma(r(ch)?|y)|apr(il)?|ju((ly?)|(ne?))|aug(ust)?|oct(ober)?|(sep(?=\\b|t)t?|nov|dec)(ember)?)\\s\\d{2}(\\s|$)",
	    // 10 dec+ 15
	    // adapted from http://regexlib.com/REDetails.aspx?regexp_id=405

	    "(3[0-1]|2[0-9]|1[0-9]|(0?)[1-9])[.|/|-](1[0-2]|(0?)[1-9])[.|/|-]\\d{1,4}", // 10.12.2015
	    // OR
	    // 10/12/2015
	    // OR
	    // 10-12-2015
	    "(3[0-1]|2[0-9]|(1[0-9])|(0?)[1-9])[.|/|-]((1[0-2]|(0?)[1-9]))", // 10.12
									     // OR
	    // 10/12

	    "((31(?!\\s(feb(ruary)?|apr(il)?|june?|(sep(?=\\b|t)t?|nov)(ember)?)))|(0?[1-9])|1\\d|2[0-8]|29|30)\\s(jan(uary)?|feb(ruary)?|ma(r(ch)?|y)|apr(il)?|ju((ly?)|(ne?))|aug(ust)?|oct(ober)?|(sep(?=\\b|t)t?|nov|dec)(ember)?)"
	    // 10 dec+
    };

    public static String[] timeRegex = { "[(2[0-3]|1[0-9]|[0-9])]{2}[[1-5]?[0-9]]{2}", // 2345
	    "(2[0-3]|1[0-9]|[0-9]):([1-5]?[0-9])" // 23:45
    };

    // keywords
    // DATETIME keywords regex only counts as datetime if "(digit) / today /
    // tomorrow" values are input

    public static final String[] TASK_START_DATETIME = { "(\\s|^)from (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)on (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)between (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))" };
    public static final String[] TASK_END_DATETIME = { "(\\s|^)by (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)until (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)till (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)before (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)on (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))",
	    "(\\s|^)to (\\d|(t((oday?)|(dy?)|(mr?)|(omorrow))))" };
    public static final String[] TASK_RECURRING = { "daily", "weekly", "monthly", "yearly" };

    // space
    public static final String SPACE = " ";
    public static final char SPACE_CHAR = ' ';

    // comma
    public static final String COMMA = ",";

    // empty string
    public static final String EMPTY_STRING = "";

    // theme list
    public static final String[] THEME_LIST = { "style0.css", "style1.css", "style2.css", "style3.css", "style4.css",
	    "style5.css", "style6.css", "style7.css" };

    // List item formats
    public static final String FORMAT_WHOLE_DAY = "[%1$s] Whole day";
    public static final String FORMAT_SAME_DAY = "[%1$s] %2$s hrs - %3$s hrs";
    public static final String FORMAT_EVENT = "[%1$s] %2$s hrs - [%3$s] %4$s hrs";
    public static final String FORMAT_DEADLINE = "By [%1$s] %2$s hrs";
    public static final String FORMAT_RECURRING = "Repeat %1$s [%2$s] %3$shrs - %4$s hrs";
    public static final String FORMAT_UNKNOWN = "????";

    public static final String FORMAT_FULL_DATE = "EEE dd MMM yyy";
    public static final String FORMAT_FULL_TIME = "HHmm dd MMM yyyy ";
    public static final String FORMAT_DATE_WITHOUT_YEAR = "EEE dd MMM";
    public static final String FORMAT_TWENTYFOURHOUR = "HHmm";
    public static final String FORMAT_DATE_VERBOSE = "EEEE dd MMMM";
    public static final String FORMAT_CLOCK = "HH:mm:ss";
    public static final String FORMAT_DATE = "dd MMM yyyy";

    public static final String TIME_START_OF_DAY = "0000";
    public static final String TIME_END_OF_DAY = "2359";

    public static final int TIME_START_OF_DAY_HOUR = 0;
    public static final int TIME_START_OF_DAY_MINUTE = 0;
    public static final int TIME_END_OF_DAY_HOUR = 23;
    public static final int TIME_END_OF_DAY_MINUTE = 59;

    public static final String[] AUTOCOMPLETE_ENTRIES = { "add [taskname] from [day] [time] to [day] [time]",
	    "add [taskname] from [time] to [time]", "add [taskname]", "undo", "redo", "exit", "delete [index]",
	    "mark [index]", "search [keyword]", "unmark [index]", "show", "show [date]", "enquirepath",
	    "setpath [location]", "edit [index] title/start/end/time [new value]" };

    public static final String REGEX_EDIT_POPUP = "\\D+\\s\\d+\\s\\D+.+\\z";

    // Tray icon display messages
    public static final String LABEL_ABOUT = "About";
    public static final String LABEL_SHOW = "Show";
    public static final String LABEL_EXIT = "Exit";
    public static final String LABEL_MESSAGE = "Message";
    public static final String MSG_STILL_RUNNING = APP_NAME + " is still running";
    final static String MSG_ALREADY_RUNNING = APP_NAME + " is Already Running!";
    final static String MSG_RESTORE = "CTRL + L to Restore";
    final static String MSG_ERROR = "Error occured";
    public final static String MSG_ABOUT = APP_NAME + " 2015 \nCreated by Andy, Hung, Jun Ren, Xiaoming";

    // used in Storage.java to correct index when calling String.substring()
    public static final int FIX_CORRECT_INDEX = 1;

    // used in TestStorage.java to fix number of characters needed
    public static final int FIX_CORRECT_LENGTH = 1;

    public static final String CSS_CONTENT = "content";
    public static final String CSS_DATE_DISPLAY = "dateDisplay";
    public static final String CSS_TIME_DISPLAY = "timeDisplay";
    public static final String CSS_SCROLLPANE = "scrollPane";
    public static final String CSS_INPUT_CONSOLE = "inputConsole";
    public static final String CSS_TIMED_LIST = "timedList";
    public static final String CSS_FLOATING_LIST = "floatingList";
    public static final String CSS_STATUS_BAR = "statusBar";
    public static final String CSS_LIST_ITEM = "listItem";
    public static final String CSS_TITLE_OVERDUE = "titleOverdue";
    public static final String CSS_TITLE_TASK = "titleTask";
    public static final String CSS_TITLE_EVENT = "titleEvent";
    public static final String CSS_TITLE_DEADLINE = "titleDeadline";
    public static final String CSS_INDEX = "index";
    public static final String CSS_STATUS_ICON = "statusIcon";
    public static final String CSS_DURATION = "duration";
    public static final String CSS_TASK_PREVIEW_HEADER = "taskPreviewHeader";
    public static final String CSS_TASK_PREVIEW_LABEL = "taskPreviewLabel";
    public static final String CSS_TASK_PREVIEW_DETAILS = "taskPreviewDetails";
    public static final String CSS_POPUP_LAYOUT = "popupLayout";
    public static final String CSS_POPUP_PANE = "popupPane";
    public static final String CSS_HELP_TEXT = "helpText";

    public static final String TEXT_HELP_COMMAND_LIST = "add\ndelete\nedit\nmark\nunmark\nundo\nredo\nsearch\nshow\nsetpath\nenquirepath\nexit";
    public static final String TEXT_HELP_FLEXI_COMMAND_LIST = "create / make / plus\ndel / remove / rm / minus\nchange / update / modify\nm / complete / comp\num / incomplete / incomp\nun\nre\nfind / sr\ndisplay / sh\nset\nen / viewpath";

    public static final int MAX_PATH_LENGTH = 260;

    // Error Messages
    public static final String ERROR_NULL_INPUT = "NULL input reached";
    public static final String ERROR_NULL_OBJECT = "Object not instantiated";
    public static final String ERROR_INPUT_DATE = "Wrong date input";
    public static final String ERROR_INPUT_TIME = "Wrong time input";
    public static final String ERROR_NULL_TASKS = "Unable to display tasks";
    public static final String ERROR_NULL_STATUS_TEXT = "Null string received for status bar";
    public static final String ERROR_EXPECTED = "Error is expected";
    public static final String ERROR_STYLESHEET_LOAD_FAILURE = "Unable to load stylesheet";
    public static final String ERROR_INVALID_THEME_INDEX = "Theme index out of range";
}
