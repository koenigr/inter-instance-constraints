package org.projog.content_generated_at_runtime;
import org.projog.core.udp.compiler.*;
import org.projog.core.udp.interpreter.*;
import org.projog.core.udp.*;
import org.projog.core.term.*;
import org.projog.core.*;
import static org.projog.core.term.NumericTermComparator.NUMERIC_TERM_COMPARATOR;
// testRun/1
public final class CompiledPredicate3 implements CompiledPredicate {
   private static final boolean initRule0(final Term a0) {
      final Term v0_X;
      v0_X = a0;
      if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
         StaticUserDefinedPredicateFactory_1.spyPoint.logCall(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
      }
      // SingleRuleWithSingleImmutableArgumentPredicateGenerator
      if (!v0_X.unify(ATOM)) {
         if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
            StaticUserDefinedPredicateFactory_1.spyPoint.logFail(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
         }
         return false;
      }
      if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
         StaticUserDefinedPredicateFactory_1.spyPoint.logExit(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
      }
      return true;
   }
   public CompiledPredicate3(final KnowledgeBase _kb) {
      s = KnowledgeBaseUtils.getSpyPoints(_kb).getSpyPoint(new PredicateKey("testRun", 1));
      StaticUserDefinedPredicateFactory_1 = (org.projog.core.udp.SingleRuleWithSingleImmutableArgumentPredicate)((StaticUserDefinedPredicateFactory)_kb.getPredicateFactory(new PredicateKey("test", 1))).getActualPredicateFactory();
   }
   public final boolean evaluate(final Term... args) {
      return staticEvaluate(args[0]);
   }
   static final boolean staticEvaluate(final Term a0) {
      final boolean d = s.isEnabled();
      if (d) {
         s.logCall(CompiledPredicate3.class, new Term[]{a0});
      }
      return initRule0(a0);
   }
   public final boolean isRetryable() {
      return false;
   }
   public final boolean couldReEvaluationSucceed() {
      return false;
   }
   public final void setKnowledgeBase(KnowledgeBase kb) {
      throw new RuntimeException();
   }
   public final Predicate getPredicate(final Term... termArgs) {
      return this;
   }
   private static final Term ATOM = new Atom("mainfile");
   private static org.projog.core.udp.SingleRuleWithSingleImmutableArgumentPredicate StaticUserDefinedPredicateFactory_1;
   private static SpyPoints.SpyPoint s;
}
