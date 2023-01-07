package InitialQuestions;


import Enums.MultipleChoiceEnum;
import Enums.QuestionLevelEnum;
import Enums.TrueFalseEnum;
import Question.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InitialData {
    private List<Question> initialData;

    public InitialData() {

        initialData = new ArrayList<Question>(Arrays.asList(
                new MultipleChoiceQuestion() {{
                    setTitle("Türkiye'nin başkenti neresidir ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.C);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Boyoz nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(30);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("İncir nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Bor nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(25);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Çömlek nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Çömlek nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Çömlek nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Çömlek nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Çömlek nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Taksi nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.A));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Halay nerede ünlüdür ?");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "İzmir");
                        put(MultipleChoiceEnum.B, "İstanbul");
                        put(MultipleChoiceEnum.C, "Ankara");
                        put(MultipleChoiceEnum.D, "Çanakkale");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.C));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},
                new MultipleChoiceQuestion() {{
                    setTitle("Amerikanın başkenti neresidir ? ");
                    setAnswerType(new HashMap<>() {{
                        put(MultipleChoiceEnum.A, "Chicago");
                        put(MultipleChoiceEnum.B, "Washington");
                        put(MultipleChoiceEnum.C, "Ohio");
                        put(MultipleChoiceEnum.D, "Texas");
                    }});
                    setRightAnswerChoice(MultipleChoiceEnum.A);
                    setRightAnswer(getAnswerType().get(MultipleChoiceEnum.B));
                    setPoint(50);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(20);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(30);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(35);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(45);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(25);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Katip Çelebi üniversitesi nerededir?");
                    setRightAnswer("İzmirdedir");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.KOLAY);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Yıldız teknik üniversitesi nerededir ?");
                    setRightAnswer("İstanbuldadır");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new ClassicalQuestion() {{
                    setTitle("Dünyanın ısı kaynağı nedir ?");
                    setRightAnswer("Güneştir");
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new FillBlankQuestion() {{
                    setTitle("İnsan kalbinde ______ odacık bulunmaktadır");
                    setRightAnswer("dört");
                    setPoint(10);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new FillBlankQuestion() {{
                    setTitle("İnsan ______ odacık bulunmaktadır");
                    setRightAnswer("dört");
                    setPoint(45);
                    setLevel(QuestionLevelEnum.NORMAL);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin insan seddi Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(15);
                    setLevel(QuestionLevelEnum.ZOR);
                }},

                new TrueFalseQuestion() {{
                    setTitle("Çin Japonya'da bulunur.. Doğru mu Yanlış mı?");
                    setRightAnswer(getAnswerType().get(TrueFalseEnum.D));
                    setPoint(55);
                    setLevel(QuestionLevelEnum.ZOR);
                }}
        ));
    }

    public List<Question> getInitialData() {
        return initialData;
    }

    public void setInitialData(List<Question> initialData) {
        this.initialData = initialData;
    }
}
